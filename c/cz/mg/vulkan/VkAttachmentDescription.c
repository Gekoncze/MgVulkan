#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAttachmentDescription);
}

jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->format));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->format, jniLongToPointer(valueAddress), sizeof(o->format));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getSamples(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->samples));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setSamples(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->samples, jniLongToPointer(valueAddress), sizeof(o->samples));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getLoadOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->loadOp));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setLoadOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->loadOp, jniLongToPointer(valueAddress), sizeof(o->loadOp));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getStoreOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->storeOp));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setStoreOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->storeOp, jniLongToPointer(valueAddress), sizeof(o->storeOp));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getStencilLoadOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stencilLoadOp));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setStencilLoadOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->stencilLoadOp, jniLongToPointer(valueAddress), sizeof(o->stencilLoadOp));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getStencilStoreOp(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->stencilStoreOp));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setStencilStoreOp(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->stencilStoreOp, jniLongToPointer(valueAddress), sizeof(o->stencilStoreOp));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getInitialLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->initialLayout));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setInitialLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->initialLayout, jniLongToPointer(valueAddress), sizeof(o->initialLayout));
}
jlong Java_cz_mg_vulkan_vk_VkAttachmentDescription_getFinalLayout(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    return jniPointerToLong(&(o->finalLayout));
}

void Java_cz_mg_vulkan_vk_VkAttachmentDescription_setFinalLayout(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAttachmentDescription* o = (VkAttachmentDescription*)jniLongToPointer(address);
    memcpy(&o->finalLayout, jniLongToPointer(valueAddress), sizeof(o->finalLayout));
}

