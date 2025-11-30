# ZariMate 개발 태스크 (Tasks)

## Phase 1: 프로젝트 세팅 (1-2일)
- [x] Android Studio 프로젝트 생성 (Empty Compose Activity)
- [x] `libs.versions.toml` 설정 및 의존성 추가
    - [x] Hilt (DI)
    - [x] Retrofit / OkHttp (Network)
    - [x] Room (Database)
    - [x] Navigation Compose
    - [x] Coil (Image Loading)
- [x] 패키지 구조 설계 (`data`, `domain`, `presentation`, `di`)
- [x] `secrets.properties` 설정 (API Key 보안)
    - [x] API Key: `612a6726be1665d406462a966b4652bf2a499472ebfb194c6890aa9ff12e7165`
- [x] Application 클래스 및 Hilt 설정 (`@HiltAndroidApp`)
- [x] Theme 및 Color Palette 설정 (다크모드 고려)

## Phase 2: API 연동 및 데이터 레이어 (2-3일)
- [ ] API 응답 모델 (DTO) 정의 (Kotlin Data Class)
    - [ ] 도서관 목록 응답
    - [ ] 좌석 정보 응답
- [ ] Retrofit Service Interface 정의
- [ ] Repository Interface 및 Implementation 구현
- [ ] Network Module (Hilt) 구현
    - [ ] OkHttpClient (Logging Interceptor, Timeout)
    - [ ] Retrofit Builder
- [ ] API 호출 테스트 (Unit Test 또는 UI 테스트)

## Phase 3: 핵심 UI 구현 (3-4일)
- [ ] Navigation Graph 설정 (Home, Detail, Favorite, Settings)
- [ ] **Home Screen (도서관 목록)**
    - [ ] TopAppBar (검색창 포함)
    - [ ] FilterChip (거리순/잔여율순)
    - [ ] LibraryCard 컴포넌트 (도서관명, 거리, 좌석 현황)
    - [ ] LazyColumn 리스트 구현
- [ ] **Detail Screen (도서관 상세)**
    - [ ] 도서관 기본 정보 표시
    - [ ] 열람실별 좌석 현황 리스트
    - [ ] Action Buttons (전화, 길찾기, 즐겨찾기)
- [ ] **Common Components**
    - [ ] SeatStatusBadge (여유/보통/혼잡/만석)
    - [ ] LoadingIndicator / ErrorView

## Phase 4: 위치 및 검색 기능 (2-3일)
- [ ] `ACCESS_FINE_LOCATION` 권한 요청 로직
- [ ] FusedLocationProviderClient 연동
- [ ] 현재 위치 좌표 획득 및 State 관리
- [ ] 거리 계산 유틸리티 함수 구현 (Haversine formula 등)
- [ ] 도서관 검색 로직 (이름/지역명 필터링)
- [ ] 리스트 정렬 로직 (거리순, 잔여율순)

## Phase 5: 즐겨찾기 및 로컬 데이터 (2일)
- [ ] Room Entity 정의 (`LibraryEntity`)
- [ ] DAO (Data Access Object) 정의 (Insert, Delete, Query)
- [ ] Database Module (Hilt) 구현
- [ ] Repository에 로컬 데이터 소스 연동
- [ ] **Favorite Screen (즐겨찾기)**
    - [ ] 즐겨찾기 목록 UI
    - [ ] 빈 상태 (Empty State) UI
- [ ] 즐겨찾기 추가/삭제 토글 기능 연동

## Phase 6: 지도 및 외부 연동 (2일)
- [ ] 지도 SDK (Naver or Kakao) 연동 준비 (선택 사항)
    - *MVP 단계에서는 Intent로 외부 지도 앱 연결 우선 고려*
- [ ] 전화 걸기 Intent (`Intent.ACTION_DIAL`)
- [ ] 길찾기 Intent (`Intent.ACTION_VIEW` with geo URI)

## Phase 7: 설정 및 사용성 개선 (2일)
- [ ] **Settings Screen (설정)**
    - [ ] DataStore Preferences 설정
    - [ ] 다크모드 토글
    - [ ] 자동 새로고침 간격 설정
- [ ] Pull-to-Refresh (SwipeRefresh) 구현
- [ ] 자동 새로고침 타이머 (Lifecycle aware)

## Phase 8: 테스트 및 최적화 (2-3일)
- [ ] 네트워크 에러 / 타임아웃 처리 UI 확인
- [ ] 권한 거부 시나리오 테스트
- [ ] 메모리 누수 점검
- [ ] Release 빌드 설정 (ProGuard/R8)

## Phase 9: 배포 준비 (1-2일)
- [ ] 앱 아이콘 적용
- [ ] 스플래시 스크린 구현
- [ ] 개인정보처리방침 링크 연결
