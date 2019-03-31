#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkFramebufferCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getRenderPass(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->renderPass));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setRenderPass(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->renderPass, jniLongToPointer(valueAddress), sizeof(o->renderPass));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->attachmentCount));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->attachmentCount, jniLongToPointer(valueAddress), sizeof(o->attachmentCount));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getPAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pAttachments));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setPAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->pAttachments, jniLongToPointer(valueAddress), sizeof(o->pAttachments));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->width));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->width, jniLongToPointer(valueAddress), sizeof(o->width));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->height));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->height, jniLongToPointer(valueAddress), sizeof(o->height));
}
jlong Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_getLayers(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&(o->layers));
}

void Java_cz_mg_vulkan_vk_VkFramebufferCreateInfo_setLayers(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkFramebufferCreateInfo* o = (VkFramebufferCreateInfo*)jniLongToPointer(address);
    memcpy(&o->layers, jniLongToPointer(valueAddress), sizeof(o->layers));
}

