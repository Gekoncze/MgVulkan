#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsObjectTagInfoEXT);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDebugUtilsObjectTagInfoEXT));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getObjectTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectType);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setObjectTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectType, valuePointer, sizeof(o->objectType));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getObjectHandleNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->objectHandle);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setObjectHandleNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->objectHandle, valuePointer, sizeof(o->objectHandle));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getTagNameNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->tagName);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setTagNameNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tagName, valuePointer, sizeof(o->tagName));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getTagSizeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->tagSize);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setTagSizeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->tagSize, valuePointer, sizeof(o->tagSize));
}

jlong Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_getPTagNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pTag);
}

void Java_cz_mg_vulkan_VkDebugUtilsObjectTagInfoEXT_setPTagNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pTag, &valuePointer, sizeof(o->pTag));
}


