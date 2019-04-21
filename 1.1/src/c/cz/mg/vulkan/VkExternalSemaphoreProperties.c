#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalSemaphoreProperties);
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalSemaphoreFeatures);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalSemaphoreFeatures, valuePointer, sizeof(o->externalSemaphoreFeatures));
}


