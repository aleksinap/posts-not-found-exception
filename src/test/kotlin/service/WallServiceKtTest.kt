package ru.netology.service


import org.junit.Assert.*
import org.junit.Test

import ru.netology.data.*

class WallServiceKtTest {

    @Test
    fun add_id_is_not_equal_zero() {
        val wallService = WallService()
        val post = Post(
            id = 4,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comments(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            likes = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            attachments = arrayOf(
                PhotoAttachment(
                    photo = Photo(
                        id = 1,
                        albumId = 1,
                        ownerId = 1,
                        userId = 1,
                        text = "1",
                        date = 112345,
                        sizes = arrayOf(),
                        width = 1024,
                        height = 768
                    )
                ),
                VideoAttachment(
                    video = Video(
                        id = 1,
                        ownerId = 1,
                        title = "",
                        description = "Недоступно",
                        duration = 1234,
                        image = arrayOf(),
                        firstFrame = arrayOf(),
                        date = 1423434,
                        addingDate = 1234654,
                        views = 234,
                        localViews = 6,
                        comments = 23,
                        player= "flash",
                        platform = "https://netology.ru",
                        canAdd = true,
                        isPrivate = true,
                        accessKey = "https://netology.ru",
                        processing = true,
                        isFavorite = true,
                        canComment = true,
                        canEdit = true,
                        canLike = true,
                        canRepost = true,
                        canSubscribe = true,
                        canAddToFaves = true,
                        canAtachLink = true,
                        width = 1024,
                        height = 768,
                        userId = 456345,
                        converting = true,
                        added = true,
                        isSubscribed = true,
                        repeat = true,
                        type = "video",
                        balance = 0,
                        liveStatus = "waiting",
                        live = true,
                        upcoming = true,
                        spectators = 23
                    )
                ),
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        owner_id = 1,
                        artist = "No doubt",
                        title = "Don't speak",
                        duration = 1,
                        url = "https://netology.ru",
                        lyricsId = 1,
                        albumId = 1,
                        genreId = 1,
                        date = 1,
                        no_search = true,
                        isHq = true
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 1,
                        ownerId = 1,
                        photo130 = "https://netology.ru",
                        photo604 = "https://netology.ru"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 1,
                        ownerId = 1,
                        title = "Недоступно",
                        text = "Недоступно",
                        date = 1654,
                        comments = 1,
                        readComments = 1,
                        viewUrl = "https://netology.ru"
                    )
                )
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )

        val lastPost = wallService.add(post)

        assertTrue(lastPost.id != 0)
    }

    @Test
    fun updateExisting() {
        val wallService = WallService()
        val post = Post(
            id = 2,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comments(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            likes = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            attachments = arrayOf(
                PhotoAttachment(
                    photo = Photo(
                        id = 1,
                        albumId = 1,
                        ownerId = 1,
                        userId = 1,
                        text = "1",
                        date = 112345,
                        sizes = arrayOf(),
                        width = 1024,
                        height = 768
                    )
                ),
                VideoAttachment(
                    video = Video(
                        id = 1,
                        ownerId = 1,
                        title = "",
                        description = "Недоступно",
                        duration = 1234,
                        image = arrayOf(),
                        firstFrame = arrayOf(),
                        date = 1423434,
                        addingDate = 1234654,
                        views = 234,
                        localViews = 6,
                        comments = 23,
                        player= "flash",
                        platform = "https://netology.ru",
                        canAdd = true,
                        isPrivate = true,
                        accessKey = "https://netology.ru",
                        processing = true,
                        isFavorite = true,
                        canComment = true,
                        canEdit = true,
                        canLike = true,
                        canRepost = true,
                        canSubscribe = true,
                        canAddToFaves = true,
                        canAtachLink = true,
                        width = 1024,
                        height = 768,
                        userId = 456345,
                        converting = true,
                        added = true,
                        isSubscribed = true,
                        repeat = true,
                        type = "video",
                        balance = 0,
                        liveStatus = "waiting",
                        live = true,
                        upcoming = true,
                        spectators = 23
                    )
                ),
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        owner_id = 1,
                        artist = "No doubt",
                        title = "Don't speak",
                        duration = 1,
                        url = "https://netology.ru",
                        lyricsId = 1,
                        albumId = 1,
                        genreId = 1,
                        date = 1,
                        no_search = true,
                        isHq = true
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 1,
                        ownerId = 1,
                        photo130 = "https://netology.ru",
                        photo604 = "https://netology.ru"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 1,
                        ownerId = 1,
                        title = "Недоступно",
                        text = "Недоступно",
                        date = 1654,
                        comments = 1,
                        readComments = 1,
                        viewUrl = "https://netology.ru"
                    )
                )
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )
        wallService.add(post)
        wallService.add(post)
        wallService.add(post)
        val result = wallService.update(post)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val wallService = WallService()
        val post = Post(
            id = 0,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comments(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            likes = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            attachments = arrayOf(
                PhotoAttachment(
                    photo = Photo(
                        id = 1,
                        albumId = 1,
                        ownerId = 1,
                        userId = 1,
                        text = "1",
                        date = 112345,
                        sizes = arrayOf(),
                        width = 1024,
                        height = 768
                    )
                ),
                VideoAttachment(
                    video = Video(
                        id = 1,
                        ownerId = 1,
                        title = "",
                        description = "Недоступно",
                        duration = 1234,
                        image = arrayOf(),
                        firstFrame = arrayOf(),
                        date = 1423434,
                        addingDate = 1234654,
                        views = 234,
                        localViews = 6,
                        comments = 23,
                        player= "flash",
                        platform = "https://netology.ru",
                        canAdd = true,
                        isPrivate = true,
                        accessKey = "https://netology.ru",
                        processing = true,
                        isFavorite = true,
                        canComment = true,
                        canEdit = true,
                        canLike = true,
                        canRepost = true,
                        canSubscribe = true,
                        canAddToFaves = true,
                        canAtachLink = true,
                        width = 1024,
                        height = 768,
                        userId = 456345,
                        converting = true,
                        added = true,
                        isSubscribed = true,
                        repeat = true,
                        type = "video",
                        balance = 0,
                        liveStatus = "waiting",
                        live = true,
                        upcoming = true,
                        spectators = 23
                    )
                ),
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        owner_id = 1,
                        artist = "No doubt",
                        title = "Don't speak",
                        duration = 1,
                        url = "https://netology.ru",
                        lyricsId = 1,
                        albumId = 1,
                        genreId = 1,
                        date = 1,
                        no_search = true,
                        isHq = true
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 1,
                        ownerId = 1,
                        photo130 = "https://netology.ru",
                        photo604 = "https://netology.ru"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 1,
                        ownerId = 1,
                        title = "Недоступно",
                        text = "Недоступно",
                        date = 1654,
                        comments = 1,
                        readComments = 1,
                        viewUrl = "https://netology.ru"
                    )
                )
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )
        wallService.add(post)
        wallService.add(post)
        wallService.add(post)
        val result = wallService.update(post)
        assertFalse(result)
    }
}