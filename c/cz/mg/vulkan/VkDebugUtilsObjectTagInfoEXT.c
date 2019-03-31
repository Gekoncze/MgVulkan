#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDebugUtilsObjectTagInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getObjectType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->objectType));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setObjectType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->objectType, jniLongToPointer(valueAddress), sizeof(o->objectType));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getObjectHandle(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->objectHandle));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setObjectHandle(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->objectHandle, jniLongToPointer(valueAddress), sizeof(o->objectHandle));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getTagName(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tagName));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setTagName(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->tagName, jniLongToPointer(valueAddress), sizeof(o->tagName));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getTagSize(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->tagSize));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setTagSize(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->tagSize, jniLongToPointer(valueAddress), sizeof(o->tagSize));
}
jlong Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_getPTag(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pTag));
}

void Java_cz_mg_vulkan_vk_VkDebugUtilsObjectTagInfoEXT_setPTag(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDebugUtilsObjectTagInfoEXT* o = (VkDebugUtilsObjectTagInfoEXT*)jniLongToPointer(address);
    memcpy(&o->pTag, jniLongToPointer(valueAddress), sizeof(o->pTag));
}

