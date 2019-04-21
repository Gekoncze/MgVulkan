#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalMemoryBufferCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_getHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleTypes);
}

void Java_cz_mg_vulkan_VkExternalMemoryBufferCreateInfoKHR_setHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryBufferCreateInfoKHR* o = (VkExternalMemoryBufferCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleTypes, valuePointer, sizeof(o->handleTypes));
}


