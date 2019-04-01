#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugMarkerObjectNameInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_getObjectType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectType);
}

void Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_setObjectType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectType, valuePointer, sizeof(o->objectType));
}

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_getObject(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->object);
}

void Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_setObject(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->object, valuePointer, sizeof(o->object));
}

jlong Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_getPObjectName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pObjectName);
}

void Java_cz_mg_vulkan_vk_VkDebugMarkerObjectNameInfoEXT_setPObjectName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectNameInfoEXT* o = (VkDebugMarkerObjectNameInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pObjectName, &valuePointer, sizeof(o->pObjectName));
}


