// 배너에 사용할 상품용 객체를 정의(거푸집) 
class Product {
    constructor(container,src, width, height, x, y) {
        this.container=container;
        this.img=document.createElement("img"); // 문서에 붙일 이미지
        this.src=src; // 이미지경로
        this.width=width; // 너비
        this.height=height; // 높이
        this.x=x; // left 값
        this.y=y;

        this.img.src=this.src; // img DOM 경로지정
        this.img.style.width=this.width+"px"; // img DOM 너비
        this.img.style.height=this.height+"px";
        this.img.style.position="absolute";
        this.img.style.left=this.x+"px";
        this.img.style.top=this.y+"px";

        // 생성된 DOM 객체를 원하는 부모요소에 부착
        this.container.appendChild(this.img);

        // 이미지를 대상으로 마우스 이벤트 연결
        this.img.addEventListener("mouseover", function() {
            // 현재 돌아가는 루프를 잠시 멈춘다
            flag=false;
        });
        this.img.addEventListener("mouseout", function() {
            // 현재 돌아가는 루프를 잠시 멈춘다
            flag=true;
        });

        // 클릭하면, 해당 이미지를 새로운 탭으로 보여주기
        this.img.addEventListener("click", function() {
            window.open(this.src, "_blank");
        });
        
    }
    // 물체 이동 메서드 (생성된 이후에도 left 값을 변경하여 좌표에 적용할 것이므로)
    move() {
      this.img.style.left=this.x+"px";
    //   this.img.innerText=this.x; // 현재 span의 x값 출력
    if(this.x <= -(this.width+5)) {
       this.x=(this.width+5)*6; 
    }
    }
}