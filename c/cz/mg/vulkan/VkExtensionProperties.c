#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkExtensionProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExtensionProperties);
}

jlong Java_cz_mg_vulkan_vk_VkExtensionProperties_getExtensionName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->extensionName));
}

void Java_cz_mg_vulkan_vk_VkExtensionProperties_setExtensionName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    memcpy(o->extensionName, jniLongToPointer(valueAddress), sizeof(o->extensionName));
}
jlong Java_cz_mg_vulkan_vk_VkExtensionProperties_getSpecVersion(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    return jniPointerToLong(&(o->specVersion));
}

void Java_cz_mg_vulkan_vk_VkExtensionProperties_setSpecVersion(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    memcpy(&o->specVersion, jniLongToPointer(valueAddress), sizeof(o->specVersion));
}

