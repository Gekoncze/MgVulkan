package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectEntryUsageFlagsNVX.html">khronos documentation</a>
 **/
public class VulkanObjectEntryUsageFlagsNVX extends VulkanFlags {
    public VulkanObjectEntryUsageFlagsNVX(){
        super(new VkObjectEntryUsageFlagsNVX());
    }

    public VulkanObjectEntryUsageFlagsNVX(VkObjectEntryUsageFlagsNVX vk){
        super(vk);
    }

    @Override
    public VkObjectEntryUsageFlagsNVX getVk(){
        return (VkObjectEntryUsageFlagsNVX) super.getVk();
    }

    public VulkanObjectEntryUsageFlagsNVX(int value){
        super(new VkObjectEntryUsageFlagsNVX(value));
    }

    public static class Array extends VulkanObjectEntryUsageFlagsNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryUsageFlagsNVX> {
        public Array(VkObjectEntryUsageFlagsNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectEntryUsageFlagsNVX.Array(count));
        }

        public Array(int count, VulkanObjectEntryUsageFlagsNVX o){
            this(new VkObjectEntryUsageFlagsNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectEntryUsageFlagsNVX.Array getVk(){
            return (VkObjectEntryUsageFlagsNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectEntryUsageFlagsNVX get(int i){
            return new VulkanObjectEntryUsageFlagsNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectEntryUsageFlagsNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectEntryUsageFlagsNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectEntryUsageFlagsNVX.Pointer(value));
        }

        @Override
        public VkObjectEntryUsageFlagsNVX.Pointer getVk(){
            return (VkObjectEntryUsageFlagsNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectEntryUsageFlagsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryUsageFlagsNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectEntryUsageFlagsNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectEntryUsageFlagsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectEntryUsageFlagsNVX.Pointer.Array getVk(){
                return (VkObjectEntryUsageFlagsNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectEntryUsageFlagsNVX.Pointer get(int i){
                return new VulkanObjectEntryUsageFlagsNVX.Pointer(getVk().get(i));
            }
        }
    }
}
