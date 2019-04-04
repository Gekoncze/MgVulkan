package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueue.html">khronos documentation</a>
 **/
public class VulkanQueue extends VulkanHandle {
    public VulkanQueue(){
        super(new VkQueue());
    }

    public VulkanQueue(VkQueue vk){
        super(vk);
    }

    @Override
    public VkQueue getVk(){
        return (VkQueue) super.getVk();
    }

    public VulkanQueue(int value){
        super(new VkQueue(value));
    }

    public static class Array extends VulkanQueue implements cz.mg.collections.array.ReadonlyArray<VulkanQueue> {
        public Array(VkQueue.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueue.Array(count));
        }

        public Array(int count, VulkanQueue o){
            this(new VkQueue.Array(count, o.getVk()));
        }

        @Override
        public VkQueue.Array getVk(){
            return (VkQueue.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueue get(int i){
            return new VulkanQueue(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueue.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueue.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueue.Pointer(value));
        }

        @Override
        public VkQueue.Pointer getVk(){
            return (VkQueue.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueue.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueue.Pointer> {
            public Array(int count) {
                super(new VkQueue.Pointer.Array(count));
            }

            public Array(VulkanQueue[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueue.Pointer.Array getVk(){
                return (VkQueue.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueue.Pointer get(int i){
                return new VulkanQueue.Pointer(getVk().get(i));
            }
        }
    }
}
