Gradle Wrapper (instruções)

O Gradle Wrapper não pode ser gerado diretamente pelo GitHub porque inclui arquivos binários. Siga estes passos na sua máquina local para gerar o Wrapper e adicioná‑lo ao repositório.

Gerar o Wrapper (Linux / macOS / Windows via Git Bash)
Abra um terminal na pasta raiz do projeto (onde está build.gradle.kts).
Execute: gradle wrapper
Se você já tiver o wrapper (gradlew) e só quiser garantir que está tudo ok, pode executar: ./gradlew wrapper

Gerar o Wrapper no Windows (PowerShell)
Abra PowerShell na pasta raiz do projeto e execute: gradle wrapper
O que será criado Após rodar o comando serão gerados (exatamente) os seguintes arquivos:
gradlew
gradlew.bat
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
Commitar os arquivos gerados Depois de gerar localmente, no terminal execute: git add gradlew gradlew.bat gradle/wrapper/gradle-wrapper.jar gradle/wrapper/gradle-wrapper.properties git commit -m "Add Gradle Wrapper" git push origin main

Se você não tem Gradle instalado

Abra o projeto no IntelliJ IDEA:
Menus: Tools → Kotlin → Configure Kotlin (se necessário) e depois
Procure a opção para gerar o Gradle Wrapper (ou use a ação “Generate Gradle Wrapper”).
Ou instale Gradle rapidamente via SDKMAN (Linux/macOS) ou Chocolatey/winget (Windows).
Por que o Wrapper é importante
Permite que qualquer pessoa (avaliador/empresa) rode o build e os testes sem precisar instalar uma versão específica do Gradle.
Comando comum para rodar builds usando o wrapper:
Linux/macOS: ./gradlew clean build
Windows: gradlew.bat clean build
Dica de verificação rápida (local)
Após gerar, verifique permissões:
Linux/macOS: chmod +x gradlew
Teste: ./gradlew --version
