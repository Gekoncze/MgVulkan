#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkExtensionProperties_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkExtensionProperties);
}

jlong Java_cz_mg_vulkan_VkExtensionProperties_getExtensionNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    return jniPointerToLong(o->extensionName);
}

void Java_cz_mg_vulkan_VkExtensionProperties_setExtensionNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(o->extensionName, valuePointer, sizeof(o->extensionName));
}

jlong Java_cz_mg_vulkan_VkExtensionProperties_getSpecVersionNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    return jniPointerToLong(&o->specVersion);
}

void Java_cz_mg_vulkan_VkExtensionProperties_setSpecVersionNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkExtensionProperties* o = (VkExtensionProperties*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->specVersion, valuePointer, sizeof(o->specVersion));
}


