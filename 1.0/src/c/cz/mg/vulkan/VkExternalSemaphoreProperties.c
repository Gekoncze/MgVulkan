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

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkExternalSemaphoreProperties));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getExportFromImportedHandleTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setExportFromImportedHandleTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getCompatibleHandleTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setCompatibleHandleTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalSemaphoreProperties_getExternalSemaphoreFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalSemaphoreFeatures);
}

void Java_cz_mg_vulkan_VkExternalSemaphoreProperties_setExternalSemaphoreFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalSemaphoreFeatures, valuePointer, sizeof(o->externalSemaphoreFeatures));
}


