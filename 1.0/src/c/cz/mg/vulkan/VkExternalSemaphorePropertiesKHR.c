#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalSemaphorePropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_getExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalSemaphoreFeatures);
}

void Java_cz_mg_vulkan_VkExternalSemaphorePropertiesKHR_setExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphorePropertiesKHR* o = (VkExternalSemaphorePropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalSemaphoreFeatures, valuePointer, sizeof(o->externalSemaphoreFeatures));
}


