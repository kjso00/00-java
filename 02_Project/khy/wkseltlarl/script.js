function handleSubmit(event) {
    event.preventDefault(); // 폼 제출 기본 동작 막기
    const searchInput = document.getElementById('search').value;
    if (searchInput) {
        alert(`검색어: ${searchInput}`);
    } else {
        alert('검색어를 입력하세요.');
    }
}
