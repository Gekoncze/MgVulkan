#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageCopy);
}

void Java_cz_mg_vulkan_VkImageCopy_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImageCopy));
}

jlong Java_cz_mg_vulkan_VkImageCopy_getSrcSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcSubresource);
}

void Java_cz_mg_vulkan_VkImageCopy_setSrcSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcSubresource, valuePointer, sizeof(o->srcSubresource));
}

jlong Java_cz_mg_vulkan_VkImageCopy_getSrcOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcOffset);
}

void Java_cz_mg_vulkan_VkImageCopy_setSrcOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcOffset, valuePointer, sizeof(o->srcOffset));
}

jlong Java_cz_mg_vulkan_VkImageCopy_getDstSubresourceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstSubresource);
}

void Java_cz_mg_vulkan_VkImageCopy_setDstSubresourceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstSubresource, valuePointer, sizeof(o->dstSubresource));
}

jlong Java_cz_mg_vulkan_VkImageCopy_getDstOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstOffset);
}

void Java_cz_mg_vulkan_VkImageCopy_setDstOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstOffset, valuePointer, sizeof(o->dstOffset));
}

jlong Java_cz_mg_vulkan_VkImageCopy_getExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->extent);
}

void Java_cz_mg_vulkan_VkImageCopy_setExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageCopy* o = (VkImageCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->extent, valuePointer, sizeof(o->extent));
}


