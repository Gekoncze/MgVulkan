#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalMemoryBufferCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_getHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleTypes);
}

void Java_cz_mg_vulkan_vk_VkExternalMemoryBufferCreateInfo_setHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfo* o = (VkExternalMemoryBufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleTypes, valuePointer, sizeof(o->handleTypes));
}


