#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExternalMemoryProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalMemoryProperties);
}

void Java_cz_mg_vulkan_VkExternalMemoryProperties_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkExternalMemoryProperties));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryProperties_getExternalMemoryFeaturesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalMemoryFeatures);
}

void Java_cz_mg_vulkan_VkExternalMemoryProperties_setExternalMemoryFeaturesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalMemoryFeatures, valuePointer, sizeof(o->externalMemoryFeatures));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryProperties_getExportFromImportedHandleTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalMemoryProperties_setExportFromImportedHandleTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_VkExternalMemoryProperties_getCompatibleHandleTypesNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_VkExternalMemoryProperties_setCompatibleHandleTypesNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalMemoryProperties* o = (VkExternalMemoryProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}


