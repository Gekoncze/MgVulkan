#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBufferImageCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferImageCopy);
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferOffset);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferOffset, valuePointer, sizeof(o->bufferOffset));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferRowLength(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferRowLength);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferRowLength(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferRowLength, valuePointer, sizeof(o->bufferRowLength));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferImageHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferImageHeight);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferImageHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferImageHeight, valuePointer, sizeof(o->bufferImageHeight));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageSubresource(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageSubresource);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageSubresource(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageSubresource, valuePointer, sizeof(o->imageSubresource));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageOffset);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageOffset, valuePointer, sizeof(o->imageOffset));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}


