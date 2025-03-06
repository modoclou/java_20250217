// tabItems : .tab-menu li 초기화
// tabContents : .section 초기화
// idx 변수(index 번호) : 0
const tabItems = document.querySelectorAll(".tab-menu li");
const tabContents = document.querySelectorAll(".section");
// let idx = 0; index 중복

// 초기화
// tabItems의 첫 번째 li에게 active 클래스 부여
// tabContents의 첫 번째 section에게 style.display = "block"
// tabContents에 있는 첫 번째 section에 active 클래스 부여
(function(){
    tabItems[0].classList.add('active');
    // tabContents[0].style.display = 'block';
    tabContents[0].classList.add('active');
}());

// tabItems에 forEach() 메서드 사용 : item, index
// 각 item에 클릭 이벤트를 준비

// const item = document.querySelectorAll('li')
tabItems.forEach((item, index) => {
    // li를 입력해도 가능한 이유는
    // 현재 선택 가능 요소(item)가 li 뿐이라
    // item 대신 li를 입력해도 무방한 상황
    item.addEventListener("click", () => {
        // item을 클릭하면 일단 모든 active 클래스를 제거한다

        // isActiveItem : li.active의 접근을 초기화(객체를 초기 할당)
        // isActiveContents : section.active 객체를 초기 할당
        let isActiveItem = document.querySelector('li.active');
        let isActiveContents = document.querySelector('section.active');
        // isActiveItem이 참이고 isActiveContents도 참이면
        // isActiveItem에도 classList.remove()
        // isActiveContentsdp도 classList.remove()로 active 클래스 제거
        if(isActiveItem && isActiveContents){
            isActiveItem.classList.remove('active');
            isActiveContents.classList.remove('active');
        }
        // 클릭한 item만 active 클래스 부여
        item.classList.add('active');
        // 클릭한 item이 가진 인덱스 번호와 일치하는 아이디를 가진 section을 찾아서 active 클래스를 부여
        document.getElementById(`tab${index}`).classList.add('active');
    })
});

// tabItems.forEach((list) => {
//     list.addEventListener("click", () => {
//         // let item = document.querySelector('tabItems')
//         console.log('item');
//     })
// });

// console.log(tabItems);
// console.log(tabContents);
// console.log(idx);