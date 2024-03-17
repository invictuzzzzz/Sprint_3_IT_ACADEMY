rootProject.name = "Sprint_3_IT_ACADEMY"
include("TEMA_1")
include("TEMA_2")
include("src:main:test")
findProject(":src:main:test")?.name = "test"
