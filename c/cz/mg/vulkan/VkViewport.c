#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkViewport_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkViewport);
}

jlong Java_cz_mg_vulkan_vk_VkViewport_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->x));
}

void Java_cz_mg_vulkan_vk_VkViewport_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->x, jniLongToPointer(valueAddress), sizeof(o->x));
}
jlong Java_cz_mg_vulkan_vk_VkViewport_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->y));
}

void Java_cz_mg_vulkan_vk_VkViewport_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->y, jniLongToPointer(valueAddress), sizeof(o->y));
}
jlong Java_cz_mg_vulkan_vk_VkViewport_getWidth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->width));
}

void Java_cz_mg_vulkan_vk_VkViewport_setWidth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->width, jniLongToPointer(valueAddress), sizeof(o->width));
}
jlong Java_cz_mg_vulkan_vk_VkViewport_getHeight(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->height));
}

void Java_cz_mg_vulkan_vk_VkViewport_setHeight(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->height, jniLongToPointer(valueAddress), sizeof(o->height));
}
jlong Java_cz_mg_vulkan_vk_VkViewport_getMinDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minDepth));
}

void Java_cz_mg_vulkan_vk_VkViewport_setMinDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->minDepth, jniLongToPointer(valueAddress), sizeof(o->minDepth));
}
jlong Java_cz_mg_vulkan_vk_VkViewport_getMaxDepth(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDepth));
}

void Java_cz_mg_vulkan_vk_VkViewport_setMaxDepth(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkViewport* o = (VkViewport*)jniLongToPointer(address);
    memcpy(&o->maxDepth, jniLongToPointer(valueAddress), sizeof(o->maxDepth));
}

