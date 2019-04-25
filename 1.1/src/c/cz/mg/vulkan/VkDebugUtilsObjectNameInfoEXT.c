#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsObjectNameInfoEXT);
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_getObjectTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectType);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_setObjectTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectType, valuePointer, sizeof(o->objectType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_getObjectHandleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectHandle);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_setObjectHandleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectHandle, valuePointer, sizeof(o->objectHandle));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_getPObjectNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectName);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectNameInfoEXT_setPObjectNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectName, &valuePointer, sizeof(o->pObjectName));
}


