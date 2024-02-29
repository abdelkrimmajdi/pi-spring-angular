import { Component, Renderer2, Inject } from '@angular/core';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-home-front',
  templateUrl: './home-front.component.html',
  styleUrls: ['./home-front.component.scss']
})

export class HomeFrontComponent {

  constructor(private renderer: Renderer2, @Inject(DOCUMENT) private document: Document) {}

  ngOnInit() {
    const script = this.renderer.createElement('script');
    script.type = 'text/javascript';
    script.src = 'assets/FrontOffice/js/main.js';
    script.onload = () => {
      console.log('Script loaded');
    };
    this.renderer.appendChild(this.document.body, script);
  }

}
