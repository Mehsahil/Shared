def call (String Git_URL, String Branch) {
  echo "Git repo cloine will start.."
  git url : "${Git_URL}", branch : "${Branch}"
}
