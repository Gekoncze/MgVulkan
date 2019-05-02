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

void Java_cz_mg_vulkan_VkBufferImageCopy_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkBufferImageCopy));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferOffset);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferOffset, valuePointer, sizeof(o->bufferOffset));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferRowLengthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferRowLength);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferRowLengthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferRowLength, valuePointer, sizeof(o->bufferRowLength));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getBufferImageHeightNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->bufferImageHeight);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setBufferImageHeightNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->bufferImageHeight, valuePointer, sizeof(o->bufferImageHeight));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageSubresource);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageSubresource, valuePointer, sizeof(o->imageSubresource));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageOffset);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageOffset, valuePointer, sizeof(o->imageOffset));
}

jlong Java_cz_mg_vulkan_VkBufferImageCopy_getImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkBufferImageCopy_setImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferImageCopy* o = (VkBufferImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}


