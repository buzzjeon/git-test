# Vue Starter

## Vue Starter란?

Vue Starter는 vue를 사용하여 구현한 간단한 프로젝트입니다. Spring boot를 서버로 하여 Vue에 대한 기본 환경설정과, 예제 파일을 포함하고 있습니다.

이와 관련하여 추가적인 가이드가 필요하신 경우 Confluence를 참조해주세요.

link : [Vue.js 기초 가이드](http://devops.sdsdev.co.kr/confluence/pages/viewpage.action?pageId=55225918)


## How to use

### 1. git clone

Local의 원하는 위치로 이동하여 git clone 명령을 수행합니다.
> git clone https://code.sdsdev.co.kr/VueStarter/starter.git

명령을 입력한 위치 하위로 "starter/" 폴더가 생성됩니다.
필요한 경우 별도의 형상관리 툴이나 IDE의 툴을 활용할 수 있습니다.

이후 과정은 starter - Project Root 폴더에서 진행합니다. 
> cd starter

### 2. npm 설치

먼저 npm을 설치합니다.
> npm install

다음 설치 확인을 위해 build를 수행합니다.
> npm run build

※ 빌드 과정은 향후 maven 컴파일 과정과도 연관이 되어있으니 최초 1번은 꼭 수행하여 주세요.

### 3. maven 수행

maven을 사용하여 프로젝트를 빌드합니다.
> mvn clean install


### 4. 개발목적의 watch 구동

개발 단계에서는 화면의 수정에 따른 빌드 결과를 target/ 폴더 아래로 위치 시킵니다. 
이를 위한 watch를 구동합니다.
> npm run watch

또는 (w.bat)
> w


### 5. 프로젝트 실행 및 확인

프로젝트를 실행합니다.
> mvn spring-boot:run

또는 IDE에서 Application.java 클래스의 main 메소드를 통해서도 가능합니다.


### x. 서버기동 확인

기본 포트는 80입니다. 브라우져에서 아래 주소로 접속해주세요.
> http://localhost


