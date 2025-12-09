function addComment() {
  let input = document.getElementById("commentInput");
  let text = input.value.trim();

  if (text !== "") {
    let commentBox = document.getElementById("comments");
    let newComment = document.createElement("p");
    newComment.textContent = text;
    commentBox.appendChild(newComment);

    input.value = "";
  }
}
