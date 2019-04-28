#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassSampleLocationsBeginInfoEXT);
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getAttachmentInitialSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentInitialSampleLocationsCount);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setAttachmentInitialSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentInitialSampleLocationsCount, valuePointer, sizeof(o->attachmentInitialSampleLocationsCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getPAttachmentInitialSampleLocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachmentInitialSampleLocations);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setPAttachmentInitialSampleLocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachmentInitialSampleLocations, &valuePointer, sizeof(o->pAttachmentInitialSampleLocations));
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getPostSubpassSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->postSubpassSampleLocationsCount);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setPostSubpassSampleLocationsCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->postSubpassSampleLocationsCount, valuePointer, sizeof(o->postSubpassSampleLocationsCount));
}

jlong Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_getPPostSubpassSampleLocationsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pPostSubpassSampleLocations);
}

void Java_cz_mg_vulkan_VkRenderPassSampleLocationsBeginInfoEXT_setPPostSubpassSampleLocationsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassSampleLocationsBeginInfoEXT* o = (VkRenderPassSampleLocationsBeginInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pPostSubpassSampleLocations, &valuePointer, sizeof(o->pPostSubpassSampleLocations));
}


