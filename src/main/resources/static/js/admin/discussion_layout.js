const discussionLayout = (() =>{
    const showDiscussionList = (discussionList) => {
        const discussionTBody = document.querySelector(".discussion-table tbody");
        let text = ``;
        const pagination = discussionList.pagination;
        const pageWrap = document.querySelector(".discussion-pagination")
        console.log(discussionList)
        discussionList.discussionDTOList.forEach((post) => {

            text += `
            <tr>
                <td>${post.id}</td>
                <td>${post.discussionTitle}</td>
                <td>${post.discussionText}</td>
                <td>${post.bookIsbn}</td>
                <td>${post.createdDate}</td>
                
            </tr>
            `
        })
        discussionTBody.innerHTML = text;
        text=``;

        if(pagination.prev) {
            text += `<button type="button" class="page-btn" id="${pagination.startPage - 1}">이전</button>`
        }
        for(let i = pagination.startPage; i<=pagination.endPage; i++){
            if(pagination.page === i){
                text += `<button type="button" class="page-btn active" id="${i}">${i}</button>`
                continue;
            }
            text += `<button type="button" class="page-btn" id="${i}">${i}</button>`
        }
        if(pagination.next){
            text += `<button type="button" class="page-btn" id="${pagination.endPage + 1}">다음</button>`
        }

        pageWrap.innerHTML = text;
        text=``;
    }


    return{showDiscussionList : showDiscussionList};

    })();