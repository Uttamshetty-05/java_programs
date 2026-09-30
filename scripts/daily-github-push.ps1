$ErrorActionPreference = "Stop"
$Repo = "C:\Users\ASUS\daily_codes"
$Date = Get-Date -Format "yyyy-MM-dd"
$ActivityDir = Join-Path $Repo "activity"
$ActivityFile = Join-Path $ActivityDir "$Date.md"

if (-not (Test-Path $ActivityDir)) {
    New-Item -ItemType Directory -Path $ActivityDir | Out-Null
}

if (-not (Test-Path $ActivityFile)) {
    @(
        "# Daily activity",
        "",
        "- Automated daily check-in ($Date)."
    ) | Set-Content -Path $ActivityFile -Encoding UTF8
}

Set-Location $Repo
git add $ActivityFile
$Status = git status --porcelain
if ($Status) {
    git commit -m "chore: daily activity $Date"
    git push origin main
}
