#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugMarkerObjectTagInfoEXT);
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getObjectType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectType);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setObjectType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectType, valuePointer, sizeof(o->objectType));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getObject(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->object);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setObject(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->object, valuePointer, sizeof(o->object));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getTagName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->tagName);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setTagName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tagName, valuePointer, sizeof(o->tagName));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getTagSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->tagSize);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setTagSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tagSize, valuePointer, sizeof(o->tagSize));
}

jlong Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_getPTag(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pTag);
}

void Java_cz_mg_vulkan_VkDebugMarkerObjectTagInfoEXT_setPTag(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugMarkerObjectTagInfoEXT* o = (VkDebugMarkerObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTag, &valuePointer, sizeof(o->pTag));
}


