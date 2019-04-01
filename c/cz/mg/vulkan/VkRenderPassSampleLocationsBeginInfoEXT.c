#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassSampleLocationsBeginInfoEXT);
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getAttachmentInitialSampleLocationsCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentInitialSampleLocationsCount);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setAttachmentInitialSampleLocationsCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentInitialSampleLocationsCount, valuePointer, sizeof(o->attachmentInitialSampleLocationsCount));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getPAttachmentInitialSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachmentInitialSampleLocations);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setPAttachmentInitialSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachmentInitialSampleLocations, &valuePointer, sizeof(o->pAttachmentInitialSampleLocations));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getPostSubpassSampleLocationsCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->postSubpassSampleLocationsCount);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setPostSubpassSampleLocationsCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->postSubpassSampleLocationsCount, valuePointer, sizeof(o->postSubpassSampleLocationsCount));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_getPPostSubpassSampleLocations(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pPostSubpassSampleLocations);
}

void Java_cz_mg_vulkan_vk_VkRenderPassSampleLocationsBeginInfoEXT_setPPostSubpassSampleLocations(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPostSubpassSampleLocations, &valuePointer, sizeof(o->pPostSubpassSampleLocations));
}


