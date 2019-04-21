#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalBufferPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_getExternalMemoryProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalMemoryProperties);
}

void Java_cz_mg_vulkan_VkExternalBufferPropertiesKHR_setExternalMemoryProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalBufferPropertiesKHR* o = (VkExternalBufferPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalMemoryProperties, valuePointer, sizeof(o->externalMemoryProperties));
}


