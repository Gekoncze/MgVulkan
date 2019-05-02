#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkFramebufferCreateInfo);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkFramebufferCreateInfo));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getRenderPassNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->renderPass);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setRenderPassNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->renderPass, valuePointer, sizeof(o->renderPass));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getAttachmentCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentCount);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setAttachmentCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentCount, valuePointer, sizeof(o->attachmentCount));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getPAttachmentsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachments);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setPAttachmentsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachments, &valuePointer, sizeof(o->pAttachments));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getWidthNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->width);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setWidthNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->width, valuePointer, sizeof(o->width));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getHeightNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->height);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setHeightNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->height, valuePointer, sizeof(o->height));
}

jlong Java_cz_mg_vulkan_VkFramebufferCreateInfo_getLayersNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->layers);
}

void Java_cz_mg_vulkan_VkFramebufferCreateInfo_setLayersNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->layers, valuePointer, sizeof(o->layers));
}


