#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkRenderPassCreateInfo);
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getAttachmentCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->attachmentCount);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setAttachmentCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->attachmentCount, valuePointer, sizeof(o->attachmentCount));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getPAttachments(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pAttachments);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setPAttachments(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pAttachments, &valuePointer, sizeof(o->pAttachments));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getSubpassCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subpassCount);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setSubpassCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subpassCount, valuePointer, sizeof(o->subpassCount));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getPSubpasses(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pSubpasses);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setPSubpasses(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pSubpasses, &valuePointer, sizeof(o->pSubpasses));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getDependencyCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->dependencyCount);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setDependencyCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dependencyCount, valuePointer, sizeof(o->dependencyCount));
}

jlong Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_getPDependencies(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pDependencies);
}

void Java_cz_mg_vulkan_vk_VkRenderPassCreateInfo_setPDependencies(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkRenderPassCreateInfo* o = (VkRenderPassCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pDependencies, &valuePointer, sizeof(o->pDependencies));
}


