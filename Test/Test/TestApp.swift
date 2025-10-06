import SwiftUI
import TDL_Example_Shared

@main
struct TestApp: App {
    private let viewModel = ViewModel()

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
