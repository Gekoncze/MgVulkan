#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalMemoryPropertiesKHR);
}

jlong Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_getExternalMemoryFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalMemoryFeatures);
}

void Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_setExternalMemoryFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalMemoryFeatures, valuePointer, sizeof(o->externalMemoryFeatures));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalMemoryPropertiesKHR_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryPropertiesKHR* o = (VkExternalMemoryPropertiesKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}


