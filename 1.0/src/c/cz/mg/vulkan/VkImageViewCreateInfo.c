#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageViewCreateInfo);
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getViewType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewType);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setViewType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewType, valuePointer, sizeof(o->viewType));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getFormat(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->format);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setFormat(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->format, valuePointer, sizeof(o->format));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getComponents(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->components);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setComponents(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->components, valuePointer, sizeof(o->components));
}

jlong Java_cz_mg_vulkan_VkImageViewCreateInfo_getSubresourceRange(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    return jniPointerToLong(&o->subresourceRange);
}

void Java_cz_mg_vulkan_VkImageViewCreateInfo_setSubresourceRange(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageViewCreateInfo* o = (VkImageViewCreateInfo*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->subresourceRange, valuePointer, sizeof(o->subresourceRange));
}


