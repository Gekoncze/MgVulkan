#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkObjectTableVertexBufferEntryNVX);
}

jlong Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_getType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->type));
}

void Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_setType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    memcpy(&o->type, jniLongToPointer(valueAddress), sizeof(o->type));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    return jniPointerToLong(&(o->buffer));
}

void Java_cz_mg_vulkan_vk_VkObjectTableVertexBufferEntryNVX_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkObjectTableVertexBufferEntryNVX* o = (VkObjectTableVertexBufferEntryNVX*)jniLongToPointer(address);
    memcpy(&o->buffer, jniLongToPointer(valueAddress), sizeof(o->buffer));
}

