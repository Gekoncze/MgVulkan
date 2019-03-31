#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalSemaphoreProperties);
}

jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->exportFromImportedHandleTypes));
}

void Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    memcpy(&o->exportFromImportedHandleTypes, jniLongToPointer(valueAddress), sizeof(o->exportFromImportedHandleTypes));
}
jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->compatibleHandleTypes));
}

void Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    memcpy(&o->compatibleHandleTypes, jniLongToPointer(valueAddress), sizeof(o->compatibleHandleTypes));
}
jlong Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_getExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->externalSemaphoreFeatures));
}

void Java_cz_mg_vulkan_vk_VkExternalSemaphoreProperties_setExternalSemaphoreFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalSemaphoreProperties* o = (VkExternalSemaphoreProperties*)jniLongToPointer(address);
    memcpy(&o->externalSemaphoreFeatures, jniLongToPointer(valueAddress), sizeof(o->externalSemaphoreFeatures));
}

