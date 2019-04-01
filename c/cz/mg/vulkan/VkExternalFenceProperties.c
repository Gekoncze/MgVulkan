#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalFenceProperties);
}

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkExternalFenceProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkExternalFenceProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->exportFromImportedHandleTypes);
}

void Java_cz_mg_vulkan_vk_VkExternalFenceProperties_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->exportFromImportedHandleTypes, valuePointer, sizeof(o->exportFromImportedHandleTypes));
}

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->compatibleHandleTypes);
}

void Java_cz_mg_vulkan_vk_VkExternalFenceProperties_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->compatibleHandleTypes, valuePointer, sizeof(o->compatibleHandleTypes));
}

jlong Java_cz_mg_vulkan_vk_VkExternalFenceProperties_getExternalFenceFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->externalFenceFeatures);
}

void Java_cz_mg_vulkan_vk_VkExternalFenceProperties_setExternalFenceFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalFenceProperties* o = (VkExternalFenceProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->externalFenceFeatures, valuePointer, sizeof(o->externalFenceFeatures));
}


