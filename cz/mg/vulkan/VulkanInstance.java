package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstance.html">khronos documentation</a>
 **/
public class VulkanInstance extends VulkanHandle {
    public VulkanInstance(){
        super(new VkInstance());
    }

    public VulkanInstance(VkInstance vk){
        super(vk);
    }

    @Override
    public VkInstance getVk(){
        return (VkInstance) super.getVk();
    }

    public VulkanInstance(int value){
        super(new VkInstance(value));
    }

    public static class Array extends VulkanInstance implements cz.mg.collections.array.ReadonlyArray<VulkanInstance> {
        public Array(VkInstance.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInstance.Array(count));
        }

        public Array(int count, VulkanInstance o){
            this(new VkInstance.Array(count, o.getVk()));
        }

        @Override
        public VkInstance.Array getVk(){
            return (VkInstance.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInstance get(int i){
            return new VulkanInstance(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInstance.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInstance.Pointer());
        }

        public Pointer(long value) {
            this(new VkInstance.Pointer(value));
        }

        @Override
        public VkInstance.Pointer getVk(){
            return (VkInstance.Pointer) super.getVk();
        }

        public static class Array extends VulkanInstance.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInstance.Pointer> {
            public Array(int count) {
                super(new VkInstance.Pointer.Array(count));
            }

            public Array(VulkanInstance[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInstance.Pointer.Array getVk(){
                return (VkInstance.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInstance.Pointer get(int i){
                return new VulkanInstance.Pointer(getVk().get(i));
            }
        }
    }
}
