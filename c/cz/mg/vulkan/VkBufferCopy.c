#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkBufferCopy_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkBufferCopy);
}

jlong Java_cz_mg_vulkan_vk_VkBufferCopy_getSrcOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->srcOffset));
}

void Java_cz_mg_vulkan_vk_VkBufferCopy_setSrcOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    memcpy(&o->srcOffset, jniLongToPointer(valueAddress), sizeof(o->srcOffset));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCopy_getDstOffset(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->dstOffset));
}

void Java_cz_mg_vulkan_vk_VkBufferCopy_setDstOffset(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    memcpy(&o->dstOffset, jniLongToPointer(valueAddress), sizeof(o->dstOffset));
}
jlong Java_cz_mg_vulkan_vk_VkBufferCopy_getSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    return jniPointerToLong(&(o->size));
}

void Java_cz_mg_vulkan_vk_VkBufferCopy_setSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkBufferCopy* o = (VkBufferCopy*)jniLongToPointer(address);
    memcpy(&o->size, jniLongToPointer(valueAddress), sizeof(o->size));
}

