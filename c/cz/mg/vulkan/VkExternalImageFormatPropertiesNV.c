#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExternalImageFormatPropertiesNV);
}

jlong Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_getImageFormatProperties(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageFormatProperties));
}

void Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_setImageFormatProperties(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    memcpy(&o->imageFormatProperties, jniLongToPointer(valueAddress), sizeof(o->imageFormatProperties));
}
jlong Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_getExternalMemoryFeatures(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->externalMemoryFeatures));
}

void Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_setExternalMemoryFeatures(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    memcpy(&o->externalMemoryFeatures, jniLongToPointer(valueAddress), sizeof(o->externalMemoryFeatures));
}
jlong Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_getExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->exportFromImportedHandleTypes));
}

void Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_setExportFromImportedHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    memcpy(&o->exportFromImportedHandleTypes, jniLongToPointer(valueAddress), sizeof(o->exportFromImportedHandleTypes));
}
jlong Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_getCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    return jniPointerToLong(&(o->compatibleHandleTypes));
}

void Java_cz_mg_vulkan_vk_VkExternalImageFormatPropertiesNV_setCompatibleHandleTypes(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExternalImageFormatPropertiesNV* o = (VkExternalImageFormatPropertiesNV*)jniLongToPointer(address);
    memcpy(&o->compatibleHandleTypes, jniLongToPointer(valueAddress), sizeof(o->compatibleHandleTypes));
}

