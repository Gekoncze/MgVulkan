#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkBufferCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferCopy);
}

jlong Java_cz_mg_vulkan_VkBufferCopy_getSrcOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->srcOffset);
}

void Java_cz_mg_vulkan_VkBufferCopy_setSrcOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->srcOffset, valuePointer, sizeof(o->srcOffset));
}

jlong Java_cz_mg_vulkan_VkBufferCopy_getDstOffsetNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->dstOffset);
}

void Java_cz_mg_vulkan_VkBufferCopy_setDstOffsetNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dstOffset, valuePointer, sizeof(o->dstOffset));
}

jlong Java_cz_mg_vulkan_VkBufferCopy_getSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&o->size);
}

void Java_cz_mg_vulkan_VkBufferCopy_setSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->size, valuePointer, sizeof(o->size));
}


