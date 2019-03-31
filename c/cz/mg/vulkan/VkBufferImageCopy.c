#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferImageCopy);
}

jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getBufferOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bufferOffset));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setBufferOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->bufferOffset, jniLongToPointer(valueAddress), sizeof(o->bufferOffset));
}
jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getBufferRowLength(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bufferRowLength));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setBufferRowLength(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->bufferRowLength, jniLongToPointer(valueAddress), sizeof(o->bufferRowLength));
}
jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getBufferImageHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->bufferImageHeight));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setBufferImageHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->bufferImageHeight, jniLongToPointer(valueAddress), sizeof(o->bufferImageHeight));
}
jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getImageSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageSubresource));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setImageSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->imageSubresource, jniLongToPointer(valueAddress), sizeof(o->imageSubresource));
}
jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getImageOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageOffset));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setImageOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->imageOffset, jniLongToPointer(valueAddress), sizeof(o->imageOffset));
}
jlong Java_cz_mg_vulkan_vk_VkBufferImageCopy_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageExtent));
}

void Java_cz_mg_vulkan_vk_VkBufferImageCopy_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    memcpy(&o->imageExtent, jniLongToPointer(valueAddress), sizeof(o->imageExtent));
}

