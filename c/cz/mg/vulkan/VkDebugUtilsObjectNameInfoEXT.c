#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsObjectNameInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_getObjectType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->objectType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_setObjectType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    memcpy(&o->objectType, jniLongToPointer(valueAddress), sizeof(o->objectType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_getObjectHandle(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->objectHandle));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_setObjectHandle(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    memcpy(&o->objectHandle, jniLongToPointer(valueAddress), sizeof(o->objectHandle));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_getPObjectName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pObjectName));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectNameInfoEXT_setPObjectName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectNameInfoEXT* o = (VkDebugUtilsObjectNameInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pObjectName, jniLongToPointer(valueAddress), sizeof(o->pObjectName));
}

