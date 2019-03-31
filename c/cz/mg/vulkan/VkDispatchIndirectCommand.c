#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDispatchIndirectCommand);
}

jlong Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_getX(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->x));
}

void Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_setX(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->x, jniLongToPointer(valueAddress), sizeof(o->x));
}
jlong Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_getY(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->y));
}

void Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_setY(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->y, jniLongToPointer(valueAddress), sizeof(o->y));
}
jlong Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_getZ(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    return jniPointerToLong(&(o->z));
}

void Java_cz_mg_vulkan_vk_VkDispatchIndirectCommand_setZ(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDispatchIndirectCommand* o = (VkDispatchIndirectCommand*)jniLongToPointer(address);
    memcpy(&o->z, jniLongToPointer(valueAddress), sizeof(o->z));
}

