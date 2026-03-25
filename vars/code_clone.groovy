def call (String git_url, String code_branch) {
    git url : "${git_url}", branch : "${code_branch}"
}
