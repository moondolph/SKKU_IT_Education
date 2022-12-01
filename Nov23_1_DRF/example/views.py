from rest_framework import viewsets,permissions,
from rest_framework.response import Response
from rest_framework.response import Response

# Create your views here.
@api_view(['GET'])
def HelloAPI(requeset):
    return Response("Success !")

# @ : Decorator (데코레이터)
#    Spring에서 사용하던 Annotation(어노테이션)과 유사한 기능
#    HelloAPI라는 함수가 GET 방식의 요청을 받을 수 있는 API다! 라는 것을 표현
#    결과를 반환할 때 Response라는 클래스를 사용하게 되는데
#        응답에 대한 정보들을 담고 있음
#    response.data : 응답에 포함되는 데이터,
#    response.status : 응답에 대한 상태를 나타냄

#응답 상태 코드 : 요청에 대한 응답이 어떤 상태인지 나타내주는 코드값
#    HTTP_200_OK : GET 방식 요청이 정상적으로 이루어졌을 때
#    HTTP_201_CREATED : POST 방식 요청이 정상적으로 이루어졌을 때
#    HTTP_400_BAD_REQUEST : 잘못된 요청을 보냈을 때
#    HTTP_401_UNAUTHORIZED : 인증이 필요할 때 인증 관련한 내용이 요청에 없을 때
#    HTTP_403_FORBIDDEN : 클라이언트가 접근하지 못하도록 막아놓은 곳 
#    HTTP_404_NOT_FOUND : 요청을 보낸 곳이 잘못된 URL일 때 
#    HTTP_
